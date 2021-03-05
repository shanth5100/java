dire="_runScript"
pwDir () {
    curDir="${PWD##*/}"
    echo "$curDir"
}

executeApp () {
    cd ..
    cd application
    mvn -X spring-boot:run > ../_runScript/mvn_run.log
}

# We need to declare a Func Def and execute.
pwDir
if [ "$curDir" = "$dire" ]
then
    echo $curDir;
    executeApp;
else
    echo "not a run Dir"
fi
