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
        mail bcc: '', body: 'The job has been competed', cc: 'support@gmail.com', from: '', replyTo: '', subject: 'Pipeline', to: 'davron.n@yahoo.com'
    }
}
