plugins {
  `java-library`
}

dependencies {
  compileOnly("org.apache.pinot:pinot-spi:0.10.0")
  compileOnly("org.apache.pinot:pinot-avro-base:0.10.0")
  compileOnly("org.apache.kafka:kafka-streams:7.2.1-ccs")
  compileOnly("org.apache.kafka:kafka-clients:7.2.1-ccs")
  implementation("org.hypertrace.core.kafkastreams.framework:kafka-streams-serdes:0.1.29") {
    // disable the transitive dependencies and use them from pinot itself.
    isTransitive = false
  }
}
