DIRNAME="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd "$DIRNAME"
#class paths
APP_CLASSPATH=lib/*:lib/clib/*
java -Xms128m -Xmx1024m -Dfile.encoding=UTF-8 -cp InnoVision-ide-1.0.jar:$APP_CLASSPATH com.NewVision.InnoVision.ide.main.Main "$@"