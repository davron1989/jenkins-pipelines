
node {
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
     stage("Send notification to Slack") {
        slackSend color: '#BADA55', message: 'Hello World!'
    }
}
