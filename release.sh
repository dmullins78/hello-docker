mvn clean \
  verify \
  build-helper:parse-version \
  scm:tag -Dtag=\${v.majorVersion}.\${v.minorVersion}.\${v.incrementalVersion} \
  versions:set -DnewVersion=\${v.majorVersion}.\${v.minorVersion}.\${v.nextIncrementalVersion} \
  versions:commit \
  scm:checkin -Dbasedir='./' -Dmessage='Releasing...' 


