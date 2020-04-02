node{
	stage("Git clone"){
		git credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/surjeetkm/kubernetes.git'
	}
	stage("Maven clean build artifact"){
		def mavenHome= tool name: "Maven", type: "maven"
		def command= "${mavenHome}/bin/mvn"
		sh "${command} clean package"
	}
	stage("Run Junit and Integration Test cases"){}
	stage("Build docker image"){
		app=docker.build("banded-elevator-272716/kubernates-microservice")
	}
	stage("Push Docker image to Container Registry"){
		docker.withRegistry('https://eu.gcr.io', 'gcr:myregistry') {
 	 	app.push("${env.BUILD_NUMBER}")
 	 	app.push("latest")
	}
}