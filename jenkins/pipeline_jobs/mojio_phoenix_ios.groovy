pipelineJob('Mojio_Phoenix_IOS') {
    definition {
        cps {
            script(readFileFromWorkspace('jenkins/jenkinsfiles/mojio_phoenix_ios'))
            sandbox()
        }
    }
}
