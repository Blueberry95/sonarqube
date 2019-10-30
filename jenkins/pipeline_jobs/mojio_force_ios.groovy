pipelineJob('Mojio_Force_IOS') {
    definition {
        cps {
            script(readFileFromWorkspace('jenkins/jenkinsfiles/mojio_force_ios'))
            sandbox()
        }
    }
}
