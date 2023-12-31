package br.com.teste.core.json.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Anotação para formatação de campos boleanos
 * 
 * @author Rodrigo Fernandes
 */
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@JsonSerialize(using = JsonBooleanFormatImpl.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface JsonBooleanFormat {

}
