#mvn clean \
  #verify \
mvn build-helper:parse-version scm:tag -Dtag=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion} \
  build-helper:parse-version versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion} \
  scm:checkin -Dbasedir='./' -Dmessage='Releasing...' \
  

