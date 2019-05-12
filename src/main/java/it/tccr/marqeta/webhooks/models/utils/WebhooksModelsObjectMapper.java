package it.tccr.marqeta.webhooks.models.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class WebhooksModelsObjectMapper extends ObjectMapper {

  private static final long serialVersionUID = -3135399671070987272L;

  public WebhooksModelsObjectMapper() {
    super(new ObjectMapper()
      .registerModule(new Jdk8Module())
      .registerModule(new JavaTimeModule()));
  }
}
