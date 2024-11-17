1. ./gradlew shadowJar
2. Copy ./build/libs/pegaagent-1.0-SNAPSHOT-all.jar to pega directory
3. Add jvm arg "-javaagent:${PEGA_HOME}/pegaagent-1.0-SNAPSHOT-all.jar" for example
Original https://github.com/ytsaurus/ytsaurus-spyt/blob/3738bc2503df8d5964253602b68eecbac7a2e788/spark-patch/src/main/java/tech/ytsaurus/spyt/patch/SparkPatchAgent.java
