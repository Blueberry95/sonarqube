pipelineJob('Mojio_Phoenix_Android') {
    definition {
        cps {
            script(readFileFromWorkspace('jenkins/jenkinsfiles/mojio_phoenix_android'))
            sandbox()
        }
    }
}
