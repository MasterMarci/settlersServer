grammar textProtocol;

@header { package de.hs.settlers.server.parser; }

options {
    language = Java;
}

command : help | login | LOGOUT | list | createGame | joinGame | msg | UPLOADMAP | downloadMap | createTestplayer | NOOP;

login : 'LOGIN' ' ' username=identifier ' ' password=pwd;



help : 'HELP' ' ' infoFor=(TEXT | NUMBER)+;

list : 'LIST' ' ' listOption = ('MAPS' | 'USERS' | 'GAMES');

createGame : 'CREATE' ' ' 'GAME' gameName=identifier 'maxPlayers' ' ' maxPlayers=NUMBER+;

joinGame : 'JOIN' ' ' 'GAME' gameName=identifier ('-visitor'  joinedAsVisitor=('true' | 'false'))?;

msg : (allChannel='ALL' | ( channelType=('USER' | 'TEAM') ' ' recipient=identifier) ' ' )? message=(TEXT | NUMBER | ' ')+;



downloadMap : 'DOWNLOAD' ' ' 'MAP' ' ' mapName=identifier;

createTestplayer : 'CREATE' ' ' 'TESTPLAYER';

pwd: (TEXT | NUMBER)+;
identifier : TEXT (TEXT | NUMBER)*;

UPLOADMAP : 'UPLOAD' ' ' 'MAP';
LOGOUT : 'LOGOUT';
NOOP : 'NOOP';
TEXT : [ a-zA-Z$ ];
NUMBER : '0'..'9'+;
WHITEDPACE : ( '\t' | '\r' | '\n' | '\u000C' )+ -> skip;