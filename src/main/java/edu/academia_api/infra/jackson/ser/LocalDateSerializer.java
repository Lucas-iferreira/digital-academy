package edu.academia_api.infra.jackson.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import edu.academia_api.infra.jackson.ObjectMapperConfig;
import edu.academia_api.infra.utils.JavaTimeUtils;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.time.LocalDate;

@Configuration
public class LocalDateSerializer extends StdSerializer<LocalDate> {
    private static final long serialVersionUID = -2718386750062666481L;

    public LocalDateSerializer(){super(LocalDate.class);}

    @Override
    public void serialize(final LocalDate value, final JsonGenerator generator, final SerializerProvider provider) throws IOException {
        generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_FORMATTER));
    }
}
