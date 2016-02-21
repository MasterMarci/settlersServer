grammar textProtocol;

@header { package de.hs.settlers.server.parser; }

options {
    language = Java;
}

commands : command;

command : help | login | logout | list | createGame | joinGame | msg | uploadMap | downloadMap | createTestplayer | noop;

login : 'LOGIN' ' ' username=identifier ' ' password=(TEXT | NUMBER)+;

logout : 'LOGOUT';

help : 'HELP' ' ' infoFor=(TEXT | NUMBER)+;

list : 'LIST' ' ' listOption = ('MAPS' | 'USERS' | 'GAMES');

createGame : 'CREATE' ' ' 'GAME' gameName=identifier 'maxPlayers' ' ' maxPlayers=NUMBER+;

joinGame : 'JOIN' ' ' 'GAME' gameName=identifier ('-visitor'  joinedAsVisitor=('true' | 'false'))?;

msg : (allChannel='ALL' | ( channelType=('USER' | 'TEAM') ' ' recipient=identifier) ' ' )? message=(TEXT | NUMBER | WHITESPACEFORMESSAGES)+;

uploadMap : 'UPLOAD' ' ' 'MAP';

downloadMap : 'DOWNLOAD' ' ' 'MAP' ' ' mapName=identifier;

createTestplayer : 'CREATE' ' ' 'TESTPLAYER';

noop : 'NOOP';

identifier : TEXT (TEXT | NUMBER)*;

TEXT : [ a-zA-Z$ ];
NUMBER : ['0'..'9'];
WHITESPACEFORMESSAGES : ( '\t' | ' ')+;
WHITEDPACE : ( '\t' | '\r' | '\n' | '\u000C' )+ -> skip;