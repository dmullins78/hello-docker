mvn clean \
  verify \
  build-helper:parse-version \
  scm:tag -Dtag=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion} \
  versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.nextIncrementalVersion} \
  versions:commit \
  scm:checkin -Dbasedir='./' -Dmessage='Releasing...' 


