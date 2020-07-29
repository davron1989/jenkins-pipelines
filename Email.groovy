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
     stage("Send Email to Support") {
        mail bcc: '', body: 'Running', cc: 'example@company.com', from: '', replyTo: '', subject: 'test', to: 'davron.n@yahoo.com'
    }
}
