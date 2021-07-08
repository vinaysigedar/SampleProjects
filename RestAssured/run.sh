#!/bin/bash
javadoc -docletpath target/RestAssured-0.0.1-SNAPSHOT-jar-with-dependencies.jar -doclet sdet.RestAssured.Doclet "$@"
