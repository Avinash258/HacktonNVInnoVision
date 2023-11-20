@echo off
pushd %~dp0

rem For App to load lib from
SET APP_CLASSPATH=lib\*;lib\clib\*

IF "%~1" == "" (
start javaw -Xms128m -Xmx1024m -Dfile.encoding=UTF-8 -cp InnoVision-ide-1.0.jar;%APP_CLASSPATH%; com.NewVision.InnoVision.ide.main.Main %*
) ELSE (
java -Xms128m -Xmx1024m -Dfile.encoding=UTF-8 -cp InnoVision-ide-1.0.jar;%APP_CLASSPATH%; com.NewVision.InnoVision.ide.main.Main %*
)