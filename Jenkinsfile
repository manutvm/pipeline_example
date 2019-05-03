node {
	stage('checkout'){
		checkout scm
    }
	stage('build'){
		sh 'mvn clean install'
	} 
	stage('quality'){
	    sh 'mvn sonar:sonar'
	}

}
