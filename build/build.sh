# For JDK on OSX
if [[ $TRAVIS_OS_NAME == 'osx' ]]; then
	/usr/libexec/java_home -V
	
	brew update

	brew outdated caskroom/cask/brew-cask || brew upgrade caskroom/cask/brew-cask

	brew tap caskroom/versions
	
	sudo rm -rf /Library/Java/JavaVirtualMachines
	
	brew cask install caskroom/versions/java8

	/usr/libexec/java_home --failfast --version 1.8
else
	export TRAVIS_JDK_VERSION='openjdk8'
fi
