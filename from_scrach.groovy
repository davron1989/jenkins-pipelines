node {
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '5')), pipelineTriggers([cron('* * * * *')])])




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
