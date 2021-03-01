dire="_runScript"
pwDir () {
    curDir="${PWD##*/}"
    echo "$curDir"
}

executeApp () {
    cd ..

    mvn clean install > ./_runScript/mvn_install.log
    installResu=$?
    if [ "$installResu" = "0" ]
    then
        echo "install success"
        # appRunDir="application"
        cd application
        # pwDir
        # if [ "$curDir" = "$appRunDir" ]
        # then
            mvn -X spring-boot:run > ../_runScript/mvn_run.log
        # fi
    else
        echo "install fail"
    fi
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
