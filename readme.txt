Config server is used to pick configurations for projects from git repo.
common configurations are placed in application.properties
microservice specific configurations are placed in ms specific properties.
spring.application.name is used to create ms specific properties. e.g create customerms.properties for customerms(proj name)


Steps-
--------

1. Create git repository. e.g. microservice-config.git
2. Create new project config-server with spring-cloud-config-server dependency
3. Add @EnableConfigServer in main class

4. Add below properties in appliation.properties
	server.port=3333
	spring.application.name=config-server
	#specify git uri
	spring.cloud.config.server.git.uri=https://github.com/sethiya999/microservice-config.git
	spring.cloud.config.fail-fast=true
	management.security.enabled=false