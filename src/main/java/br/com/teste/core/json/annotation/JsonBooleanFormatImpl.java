package br.com.teste.core.json.annotation;

import java.io.IOException;

import org.apache.commons.lang3.BooleanUtils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Implementação que gera um atributo JSON para um campo boleano
 * 
 * @author Rodrigo Fernandes
 */
public class JsonBooleanFormatImpl extends JsonSerializer<Boolean> {

	@Override
	public void serialize(Boolean value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeObject(value);
		gen.writeStringField(gen.getOutputContext().getCurrentName() + "_fmt",
				String.format("json.format.boolean.%s", BooleanUtils.isTrue(value)));
	}

}
