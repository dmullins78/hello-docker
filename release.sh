#mvn clean \
  #verify \
  #scm:tag -Dtag=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion} \
  mvn build-helper:parse-version \
  versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.majorVersion} \
  scm:checkin -Dbasedir='./' -Dmessage='Releasing...' \


