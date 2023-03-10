package com.example.generated.core;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

public final class ObjectMappers {
  public static final ObjectMapper JSON_MAPPER = JsonMapper.builder()
    .addModule(new Jdk8Module())
    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
    .build();

    private ObjectMappers() {
    }
  }
