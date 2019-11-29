pipelineJob('Mojio_Force_Web') {
    definition {
        cps {
            script(readFileFromWorkspace('jenkins/jenkinsfiles/mojio_force_web'))
            sandbox()
        }
    }
}
