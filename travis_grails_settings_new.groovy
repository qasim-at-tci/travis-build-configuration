grails.project.repos.'uk-nbn-snapshots'.url="http://repository.gbif.org/content/repositories/snapshots/"
grails.project.repos.'uk-nbn-snapshots'.username=System.getenv("TRAVIS_DEPLOY_USERNAME")
grails.project.repos.'uk-nbn-snapshots'.password=System.getenv("TRAVIS_DEPLOY_PASSWORD")

grails.project.repos.'uk-nbn-releases'.url="http://repository.gbif.org/content/repositories/releases/"
grails.project.repos.'uk-nbn-releases'.username=System.getenv("TRAVIS_DEPLOY_USERNAME")
grails.project.repos.'uk-nbn-releases'.password=System.getenv("TRAVIS_DEPLOY_PASSWORD")
