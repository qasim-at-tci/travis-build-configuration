grails.project.dependency.distribution = {
  remoteRepository(id:"uk-nbn-snapshots", url:"http://repository.gbif.org/content/repositories/snapshots") {
    authentication username: System.getenv("TRAVIS_DEPLOY_USERNAME"), password: System.getenv("TRAVIS_DEPLOY_PASSWORD")
  }

  remoteRepository(id:"uk-nbn-release",  url:"http://repository.gbif.org/content/repositories/releases") {
    authentication username: System.getenv("TRAVIS_DEPLOY_USERNAME"), password: System.getenv("TRAVIS_DEPLOY_PASSWORD")
  }
}
