package io.vertx.core.spi.json;

/**
 * This interface represents the Vert.x json representation of any <TARGET_TYPE> <br/>
 *
 * To use it in {@code @ModuleGen} annotation you must provide a {@code public static final [JsonMapperType] INSTANCE} to let codegen retrieve an instance of it
 *
 * @param <TARGET_TYPE>
 * @param <JSON_TYPE>
 */
public interface JsonMapper<TARGET_TYPE, JSON_TYPE> extends JsonSerializer<TARGET_TYPE, JSON_TYPE>, JsonDeserializer<TARGET_TYPE, JSON_TYPE> { }