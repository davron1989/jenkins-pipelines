node {
    properties([
        // below line discards builds more than 5
        buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '5')), 
        // below line triggers this job when code is changed
        pipelineTriggers([pollSCM('* * * * *')])
        ])




    stage("Stage1") {
        echo "Hello"
    }
     stage("Stage2") {
        echo "Hello"
    }
     stage("Stage3") {
        echo "Hello"
    }
     stage("Stage4") {
        echo "Hello"
    }
     stage("Stage5") {
        echo "Hello"
    }
}
