package br.com.teste.core.json.annotation;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Gera um atributo json para um campo enum
 * 
 * @author Rodrigo Fernandes
 */
public class JsonFieldEnumFormatImpl extends JsonSerializer<Enum<?>> {

	@Override
	public void serialize(Enum<?> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeObject(value.name());
		gen.writeStringField(gen.getOutputContext().getCurrentName() + "_fmt", value.toString());
	}

}
