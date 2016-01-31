mvn package \
  build-helper:parse-version \
  scm:tag -Dtag=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion} \
  versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.nextIncrementalVersion} \
  scm:checkin -Dbasedir='./' -Dmessage='Releasing...'

