pipelineJob('Mojio_Force_Android') {
    definition {
        cps {
            script(readFileFromWorkspace('jenkins/jenkinsfiles/mojio_force_android'))
            sandbox()
        }
    }
}
