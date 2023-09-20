package br.com.teste.core.json.annotation;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import br.com.teste.core.MaskFormat;
import br.com.teste.core.StringFormat;

/**
 * Gera um atributo JSON para um campo texto com máscara de telefone/celular
 * 
 * @author Rodrigo Fernandes
 */
public class JsonTelefoneFormatImpl extends JsonSerializer<String> {

	@Override
	public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeObject(value);
		String format = StringFormat.stringFormat(MaskFormat.TELEFONE_MASK, value);
		gen.writeStringField(gen.getOutputContext().getCurrentName() + "_fmt", format);
	}

}
