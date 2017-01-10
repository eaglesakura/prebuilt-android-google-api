# /bin/sh

cd protobuf/
../gradlew clean generateProto

rm -rf ../src/main/gen
cp -rf build/generated/source/proto/main/javalite ../src/main/gen
