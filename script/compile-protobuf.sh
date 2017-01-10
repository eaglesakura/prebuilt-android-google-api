# /bin/sh

cd protobuf/
../gradlew clean generateProto

rm -rf ../src/main/gen
mkdir ../src/main/gen

cp -rf build/generated/source/proto/main/javalite/com ../src/main/gen
cp -rf build/generated/source/proto/main/grpc/com ../src/main/gen
