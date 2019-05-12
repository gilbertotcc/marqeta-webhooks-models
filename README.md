# Marqeta Webhooks Models

Java library which models the event types sent by webhooks in the [Marqeta](https://www.marqeta.com/) platform.

The library provides also a customised [Jackson](https://github.com/FasterXML/jackson) object mapper
(`WebhooksModelsObjectMapper`) with all the configuration to successfully deserialize Marqeta's events.

For additional documentation refer to Marqeta's [Developer Portal](https://www.marqeta.com/api).

> **Note:** Currently this library does not support all the event types that Marqeta's platform sends and improvements
> might be needed (e.g., better modelling some fields now described with `JsonNode`). Although its _WIP_ status, you can
> use this library as a starting point to build you application over the Marqeta's platform.
