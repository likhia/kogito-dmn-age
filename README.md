# age project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

It was generated with the following command

	mvn io.quarkus:quarkus-maven-plugin:create \
	  -DprojectGroupId=com.example -DprojectArtifactId=kogito-dmn-age \
	  -DprojectVersion=1.0.0-SNAPSHOT -Dextensions=kogito-quarkus,quarkus-smallrye-openapi

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Compile 

./mvnw compile quarkus:dev

./mvnw package -Dquarkus.package.type=uber-jar

java -jar target/age-1.0.0-SNAPSHOT-runner.jar

## To deploy this on OpenShift

Execute the following

	oc new-build \
	  --name age \
	  --binary \
	  -i java:11

	oc start-build age --from-dir=. --follow

	oc new-app age

	oc expose svc/age

	curl \
	  -X POST \
	  "http://$(oc get route/age -o jsonpath='{.spec.host}')/AgeClassificationDMN" \
	  -H  "accept: application/json" \
	  -H  "Content-Type: application/json" \
	  -d "{\"parameters\":{\"classification\":[\"Children\",\"Adult\",\"Elderly\"],\"max\":[18,50,120],\"min\":[1,18,50]},\"age\":25}"	


## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `age-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/age-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/age-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

# RESTEasy JAX-RS

<p>A Hello World RESTEasy resource</p>

Guide: https://quarkus.io/guides/rest-json
