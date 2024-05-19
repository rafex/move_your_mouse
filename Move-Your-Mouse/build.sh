#!/bin/sh

./mvnw clean package -DskipTests -Djava.awt.headless=false

echo "Finished building the JAR file"

./mvnw -Pnative -Dagent exec:exec@java-agent -DskipTests -Djava.awt.headless=false

echo "Finished building the native image"

./mvnw -Pnative -Dagent package -DskipTests -Djava.awt.headless=false

echo "Finished building the JAR file with the agent"

./mvnw -Pnative exec:exec@native -DskipTests -Djava.awt.headless=false

echo "Finished building the native image with the agent"