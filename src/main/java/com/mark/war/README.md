An implementation of the War card game
======================================

* Requires Java 8
* run 'mvn test' which runs junit tests and a sample game
* to run a sample game, 'java -jar ./target/WarCardGame.jar'

#### Example output from 'mvn test'
        mark:warcards mark$ mvn test
        Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=128m; support was removed in 8.0
        [INFO] Scanning for projects...
        [WARNING]
        [WARNING] Some problems were encountered while building the effective model for com.mark:games:jar:1.0-SNAPSHOT
        [WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-jar-plugin is missing. @ line 89, column 21
        [WARNING]
        [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
        [WARNING]
        [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
        [WARNING]
        [INFO]
        [INFO] ------------------------------------------------------------------------
        [INFO] Building games 1.0-SNAPSHOT
        [INFO] ------------------------------------------------------------------------
        [INFO]
        [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ games ---
        [WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
        [WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
        [INFO] Copying 2 resources
        [INFO]
        [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ games ---
        [INFO] Nothing to compile - all classes are up to date
        [INFO]
        [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ games ---
        [WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
        [INFO] skip non existing resourceDirectory /Users/mark/dev/qwdev/repo/warcards/src/test/resources
        [INFO]
        [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ games ---
        [INFO] Nothing to compile - all classes are up to date
        [INFO]
        [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ games ---
        [INFO] Surefire report directory: /Users/mark/dev/qwdev/repo/warcards/target/surefire-reports
        
        -------------------------------------------------------
         T E S T S
        -------------------------------------------------------
        Running com.mark.war.DeckTest
        SLF4J: Class path contains multiple SLF4J bindings.
        SLF4J: Found binding in [jar:file:/Users/mark/.m2/repository/org/slf4j/slf4j-simple/1.6.4/slf4j-simple-1.6.4.jar!/org/slf4j/impl/StaticLoggerBinder.class]
        SLF4J: Found binding in [jar:file:/Users/mark/.m2/repository/org/slf4j/slf4j-log4j12/1.7.5/slf4j-log4j12-1.7.5.jar!/org/slf4j/impl/StaticLoggerBinder.class]
        SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
        0 [main] INFO com.mark.war.DeckImpl - *** Creating Deck with 4 suits and 13 ranks ***
        Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.198 sec
        Running com.mark.war.WarTest
        170 [main] INFO com.mark.war.Player - Dealing Four of CLUBS to player #1
        171 [main] INFO com.mark.war.Player - Dealing Three of SPADES to player #1
        171 [main] INFO com.mark.war.Player - Dealing Ace of DIAMONDS to player #2
        172 [main] INFO com.mark.war.Player - Dealing Five of CLUBS to player #2
        172 [main] INFO com.mark.war.Player - Dealing Four of SPADES to player #3
        173 [main] INFO com.mark.war.Player - Dealing Jack of DIAMONDS to player #3
        173 [main] INFO com.mark.war.DeckImpl - *** Creating Deck with 4 suits and 13 ranks ***
        173 [main] INFO com.mark.war.War - Dealing 52 cards to 3 players
        179 [main] INFO com.mark.war.Player - Dealing Ace of HEARTS to player #0
        179 [main] INFO com.mark.war.Player - Dealing Two of HEARTS to player #1
        179 [main] INFO com.mark.war.Player - Dealing Three of HEARTS to player #2
        180 [main] INFO com.mark.war.Player - Dealing Four of HEARTS to player #0
        180 [main] INFO com.mark.war.Player - Dealing Five of HEARTS to player #1
        180 [main] INFO com.mark.war.Player - Dealing Six of HEARTS to player #2
        180 [main] INFO com.mark.war.Player - Dealing Seven of HEARTS to player #0
        180 [main] INFO com.mark.war.Player - Dealing Eight of HEARTS to player #1
        181 [main] INFO com.mark.war.Player - Dealing Nine of HEARTS to player #2
        181 [main] INFO com.mark.war.Player - Dealing Ten of HEARTS to player #0
        181 [main] INFO com.mark.war.Player - Dealing Jack of HEARTS to player #1
        181 [main] INFO com.mark.war.Player - Dealing Queen of HEARTS to player #2
        182 [main] INFO com.mark.war.Player - Dealing King of HEARTS to player #0
        182 [main] INFO com.mark.war.Player - Dealing Ace of SPADES to player #1
        182 [main] INFO com.mark.war.Player - Dealing Two of SPADES to player #2
        182 [main] INFO com.mark.war.Player - Dealing Three of SPADES to player #0
        183 [main] INFO com.mark.war.Player - Dealing Four of SPADES to player #1
        183 [main] INFO com.mark.war.Player - Dealing Five of SPADES to player #2
        183 [main] INFO com.mark.war.Player - Dealing Six of SPADES to player #0
        183 [main] INFO com.mark.war.Player - Dealing Seven of SPADES to player #1
        184 [main] INFO com.mark.war.Player - Dealing Eight of SPADES to player #2
        184 [main] INFO com.mark.war.Player - Dealing Nine of SPADES to player #0
        184 [main] INFO com.mark.war.Player - Dealing Ten of SPADES to player #1
        185 [main] INFO com.mark.war.Player - Dealing Jack of SPADES to player #2
        185 [main] INFO com.mark.war.Player - Dealing Queen of SPADES to player #0
        185 [main] INFO com.mark.war.Player - Dealing King of SPADES to player #1
        185 [main] INFO com.mark.war.Player - Dealing Ace of CLUBS to player #2
        185 [main] INFO com.mark.war.Player - Dealing Two of CLUBS to player #0
        186 [main] INFO com.mark.war.Player - Dealing Three of CLUBS to player #1
        187 [main] INFO com.mark.war.Player - Dealing Four of CLUBS to player #2
        187 [main] INFO com.mark.war.Player - Dealing Five of CLUBS to player #0
        187 [main] INFO com.mark.war.Player - Dealing Six of CLUBS to player #1
        187 [main] INFO com.mark.war.Player - Dealing Seven of CLUBS to player #2
        188 [main] INFO com.mark.war.Player - Dealing Eight of CLUBS to player #0
        188 [main] INFO com.mark.war.Player - Dealing Nine of CLUBS to player #1
        188 [main] INFO com.mark.war.Player - Dealing Ten of CLUBS to player #2
        188 [main] INFO com.mark.war.Player - Dealing Jack of CLUBS to player #0
        189 [main] INFO com.mark.war.Player - Dealing Queen of CLUBS to player #1
        189 [main] INFO com.mark.war.Player - Dealing King of CLUBS to player #2
        189 [main] INFO com.mark.war.Player - Dealing Ace of DIAMONDS to player #0
        190 [main] INFO com.mark.war.Player - Dealing Two of DIAMONDS to player #1
        190 [main] INFO com.mark.war.Player - Dealing Three of DIAMONDS to player #2
        190 [main] INFO com.mark.war.Player - Dealing Four of DIAMONDS to player #0
        190 [main] INFO com.mark.war.Player - Dealing Five of DIAMONDS to player #1
        191 [main] INFO com.mark.war.Player - Dealing Six of DIAMONDS to player #2
        191 [main] INFO com.mark.war.Player - Dealing Seven of DIAMONDS to player #0
        191 [main] INFO com.mark.war.Player - Dealing Eight of DIAMONDS to player #1
        191 [main] INFO com.mark.war.Player - Dealing Nine of DIAMONDS to player #2
        191 [main] INFO com.mark.war.Player - Dealing Ten of DIAMONDS to player #0
        191 [main] INFO com.mark.war.Player - Dealing Jack of DIAMONDS to player #1
        192 [main] INFO com.mark.war.Player - Dealing Queen of DIAMONDS to player #2
        193 [main] INFO com.mark.war.War - New battle...
        306 [main] INFO com.mark.war.Player -    + Player #0 plays Ten of DIAMONDS
        306 [main] INFO com.mark.war.Player -    + Player #1 plays Jack of DIAMONDS
        307 [main] INFO com.mark.war.Player -    + Player #2 plays Queen of DIAMONDS
        312 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        314 [main] INFO com.mark.war.War - New battle...
        315 [main] INFO com.mark.war.Player -    + Player #0 plays Seven of DIAMONDS
        315 [main] INFO com.mark.war.Player -    + Player #1 plays Eight of DIAMONDS
        316 [main] INFO com.mark.war.Player -    + Player #2 plays Nine of DIAMONDS
        319 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        319 [main] INFO com.mark.war.War - New battle...
        320 [main] INFO com.mark.war.Player -    + Player #0 plays Four of DIAMONDS
        320 [main] INFO com.mark.war.Player -    + Player #1 plays Five of DIAMONDS
        320 [main] INFO com.mark.war.Player -    + Player #2 plays Six of DIAMONDS
        324 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        324 [main] INFO com.mark.war.War - New battle...
        325 [main] INFO com.mark.war.Player -    + Player #0 plays Ace of DIAMONDS
        325 [main] INFO com.mark.war.Player -    + Player #1 plays Two of DIAMONDS
        325 [main] INFO com.mark.war.Player -    + Player #2 plays Three of DIAMONDS
        329 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        330 [main] INFO com.mark.war.War - New battle...
        331 [main] INFO com.mark.war.Player -    + Player #0 plays Jack of CLUBS
        331 [main] INFO com.mark.war.Player -    + Player #1 plays Queen of CLUBS
        332 [main] INFO com.mark.war.Player -    + Player #2 plays King of CLUBS
        334 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        334 [main] INFO com.mark.war.War - New battle...
        335 [main] INFO com.mark.war.Player -    + Player #0 plays Eight of CLUBS
        335 [main] INFO com.mark.war.Player -    + Player #1 plays Nine of CLUBS
        336 [main] INFO com.mark.war.Player -    + Player #2 plays Ten of CLUBS
        338 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        338 [main] INFO com.mark.war.War - New battle...
        339 [main] INFO com.mark.war.Player -    + Player #0 plays Five of CLUBS
        339 [main] INFO com.mark.war.Player -    + Player #1 plays Six of CLUBS
        340 [main] INFO com.mark.war.Player -    + Player #2 plays Seven of CLUBS
        342 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        342 [main] INFO com.mark.war.War - New battle...
        343 [main] INFO com.mark.war.Player -    + Player #0 plays Two of CLUBS
        344 [main] INFO com.mark.war.Player -    + Player #1 plays Three of CLUBS
        345 [main] INFO com.mark.war.Player -    + Player #2 plays Four of CLUBS
        348 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        349 [main] INFO com.mark.war.War - New battle...
        350 [main] INFO com.mark.war.Player -    + Player #0 plays Queen of SPADES
        350 [main] INFO com.mark.war.Player -    + Player #1 plays King of SPADES
        350 [main] INFO com.mark.war.Player -    + Player #2 plays Ace of CLUBS
        352 [main] INFO com.mark.war.War - ...Player #1 wins battle and adds 3 cards to stack
        353 [main] INFO com.mark.war.War - New battle...
        353 [main] INFO com.mark.war.Player -    + Player #0 plays Nine of SPADES
        353 [main] INFO com.mark.war.Player -    + Player #1 plays Ten of SPADES
        353 [main] INFO com.mark.war.Player -    + Player #2 plays Jack of SPADES
        354 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        355 [main] INFO com.mark.war.War - New battle...
        355 [main] INFO com.mark.war.Player -    + Player #0 plays Six of SPADES
        355 [main] INFO com.mark.war.Player -    + Player #1 plays Seven of SPADES
        355 [main] INFO com.mark.war.Player -    + Player #2 plays Eight of SPADES
        357 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        358 [main] INFO com.mark.war.War - New battle...
        358 [main] INFO com.mark.war.Player -    + Player #0 plays Three of SPADES
        358 [main] INFO com.mark.war.Player -    + Player #1 plays Four of SPADES
        359 [main] INFO com.mark.war.Player -    + Player #2 plays Five of SPADES
        360 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        360 [main] INFO com.mark.war.War - New battle...
        361 [main] INFO com.mark.war.Player -    + Player #0 plays King of HEARTS
        362 [main] INFO com.mark.war.Player -    + Player #1 plays Ace of SPADES
        362 [main] INFO com.mark.war.Player -    + Player #2 plays Two of SPADES
        372 [main] INFO com.mark.war.War - ...Player #0 wins battle and adds 3 cards to stack
        372 [main] INFO com.mark.war.War - New battle...
        373 [main] INFO com.mark.war.Player -    + Player #0 plays Ten of HEARTS
        373 [main] INFO com.mark.war.Player -    + Player #1 plays Jack of HEARTS
        373 [main] INFO com.mark.war.Player -    + Player #2 plays Queen of HEARTS
        374 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        374 [main] INFO com.mark.war.War - New battle...
        375 [main] INFO com.mark.war.Player -    + Player #0 plays Seven of HEARTS
        375 [main] INFO com.mark.war.Player -    + Player #1 plays Eight of HEARTS
        375 [main] INFO com.mark.war.Player -    + Player #2 plays Nine of HEARTS
        376 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        377 [main] INFO com.mark.war.War - New battle...
        378 [main] INFO com.mark.war.Player -    + Player #0 plays Four of HEARTS
        378 [main] INFO com.mark.war.Player -    + Player #1 plays Five of HEARTS
        378 [main] INFO com.mark.war.Player -    + Player #2 plays Six of HEARTS
        379 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        379 [main] INFO com.mark.war.War - New battle...
        379 [main] INFO com.mark.war.Player -    + Player #0 plays Ace of HEARTS
        379 [main] INFO com.mark.war.Player -    + Player #1 plays Two of HEARTS
        379 [main] INFO com.mark.war.Player -    + Player #2 plays Three of HEARTS
        381 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
        384 [main] INFO com.mark.war.War - Game ranking {45=[#Player: 2, #CardsInHand: [], #CardsInStack: 45, StackCards Detail: [Jack of DIAMONDS, Queen of DIAMONDS, Ten of DIAMONDS, Eight of DIAMONDS, Nine of DIAMONDS, Seven of DIAMONDS, Five of DIAMONDS, Six of DIAMONDS, Four of DIAMONDS, Two of DIAMONDS, Three of DIAMONDS, Ace of DIAMONDS, Queen of CLUBS, King of CLUBS, Jack of CLUBS, Nine of CLUBS, Ten of CLUBS, Eight of CLUBS, Six of CLUBS, Seven of CLUBS, Five of CLUBS, Three of CLUBS, Four of CLUBS, Two of CLUBS, Ten of SPADES, Jack of SPADES, Nine of SPADES, Seven of SPADES, Eight of SPADES, Six of SPADES, Four of SPADES, Five of SPADES, Three of SPADES, Jack of HEARTS, Queen of HEARTS, Ten of HEARTS, Eight of HEARTS, Nine of HEARTS, Seven of HEARTS, Five of HEARTS, Six of HEARTS, Four of HEARTS, Two of HEARTS, Three of HEARTS, Ace of HEARTS]], 3=[#Player: 0, #CardsInHand: [], #CardsInStack: 3, StackCards Detail: [Ace of SPADES, Two of SPADES, King of HEARTS], #Player: 1, #CardsInHand: [], #CardsInStack: 3, StackCards Detail: [King of SPADES, Ace of CLUBS, Queen of SPADES]]}
        Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.286 sec
        
        Results :
        
        Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
        
        [INFO]
        [INFO] >>> exec-maven-plugin:1.1.1:java (default) > validate @ games >>>
        [INFO]
        [INFO] <<< exec-maven-plugin:1.1.1:java (default) < validate @ games <<<
        [INFO]
        [INFO] --- exec-maven-plugin:1.1.1:java (default) @ games ---
        SLF4J: Class path contains multiple SLF4J bindings.
        SLF4J: Found binding in [jar:file:/Users/mark/.m2/repository/org/slf4j/slf4j-simple/1.6.4/slf4j-simple-1.6.4.jar!/org/slf4j/impl/StaticLoggerBinder.class]
        SLF4J: Found binding in [jar:file:/Users/mark/.m2/repository/org/slf4j/slf4j-log4j12/1.7.5/slf4j-log4j12-1.7.5.jar!/org/slf4j/impl/StaticLoggerBinder.class]
        SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
        0 [com.mark.war.War.main()] INFO com.mark.war.War - Play War with 4 players and a shuffled deck containing  13 suits and 4 ranks
        1 [com.mark.war.War.main()] INFO com.mark.war.DeckImpl - *** Creating Deck with 4 suits and 13 ranks ***
        69 [com.mark.war.War.main()] INFO com.mark.war.DeckImpl - *** Shuffle Deck ***
        69 [com.mark.war.War.main()] INFO com.mark.war.War - *** New Game ***
        70 [com.mark.war.War.main()] INFO com.mark.war.War - Dealing 52 cards to 4 players
        73 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of CLUBS to player #0
        73 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of HEARTS to player #1
        73 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of CLUBS to player #2
        73 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of CLUBS to player #3
        73 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of HEARTS to player #0
        73 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of CLUBS to player #1
        73 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of HEARTS to player #2
        74 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of CLUBS to player #3
        74 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of DIAMONDS to player #0
        74 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of DIAMONDS to player #1
        74 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of HEARTS to player #2
        74 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of DIAMONDS to player #3
        74 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of DIAMONDS to player #0
        75 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of HEARTS to player #1
        75 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of SPADES to player #2
        75 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of DIAMONDS to player #3
        75 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of DIAMONDS to player #0
        75 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of SPADES to player #1
        75 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of CLUBS to player #2
        75 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of DIAMONDS to player #3
        75 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of SPADES to player #0
        75 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of SPADES to player #1
        76 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of SPADES to player #2
        76 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of SPADES to player #3
        76 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of HEARTS to player #0
        76 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of DIAMONDS to player #1
        76 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of DIAMONDS to player #2
        76 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of CLUBS to player #3
        76 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of SPADES to player #0
        77 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of CLUBS to player #1
        77 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of SPADES to player #2
        77 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of HEARTS to player #3
        78 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of SPADES to player #0
        78 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of SPADES to player #1
        78 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of HEARTS to player #2
        78 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of DIAMONDS to player #3
        78 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of CLUBS to player #0
        79 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of SPADES to player #1
        79 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of HEARTS to player #2
        79 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of DIAMONDS to player #3
        79 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of SPADES to player #0
        79 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of HEARTS to player #1
        79 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of CLUBS to player #2
        80 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of CLUBS to player #3
        80 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of CLUBS to player #0
        80 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of HEARTS to player #1
        80 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of DIAMONDS to player #2
        80 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of HEARTS to player #3
        80 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of HEARTS to player #0
        81 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of CLUBS to player #1
        81 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of SPADES to player #2
        81 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of DIAMONDS to player #3
        82 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        97 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Nine of HEARTS
        98 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Five of CLUBS
        98 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Two of SPADES
        98 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Two of DIAMONDS
        137 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 4 cards to stack
        138 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        139 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Jack of CLUBS
        139 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Queen of HEARTS
        139 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Jack of DIAMONDS
        139 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Six of HEARTS
        141 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 4 cards to stack
        141 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        141 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Eight of SPADES
        142 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Four of HEARTS
        142 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Eight of CLUBS
        142 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Six of CLUBS
        144 [com.mark.war.War.main()] INFO com.mark.war.War - !!!War!!!
        144 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        144 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Nine of CLUBS
        144 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Ace of HEARTS
        145 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 6 cards to stack
        145 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        145 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Four of SPADES
        145 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Jack of SPADES
        145 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Eight of HEARTS
        145 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays King of DIAMONDS
        147 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #3 wins battle and adds 4 cards to stack
        147 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        147 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Seven of SPADES
        147 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Three of SPADES
        147 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays King of SPADES
        147 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Eight of DIAMONDS
        149 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #2 wins battle and adds 4 cards to stack
        149 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        149 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays King of HEARTS
        149 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Queen of CLUBS
        149 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Queen of DIAMONDS
        149 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Three of HEARTS
        151 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 4 cards to stack
        151 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        152 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Five of SPADES
        152 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Four of DIAMONDS
        152 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Six of SPADES
        152 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Ace of CLUBS
        154 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #2 wins battle and adds 4 cards to stack
        154 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        154 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Seven of DIAMONDS
        154 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Queen of SPADES
        154 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Four of CLUBS
        154 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Ace of SPADES
        156 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 4 cards to stack
        156 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        156 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Five of DIAMONDS
        156 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Nine of SPADES
        157 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Ten of SPADES
        157 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Ace of DIAMONDS
        161 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #2 wins battle and adds 4 cards to stack
        161 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        161 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Six of DIAMONDS
        162 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Ten of HEARTS
        162 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Seven of HEARTS
        162 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Three of DIAMONDS
        163 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 4 cards to stack
        163 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        164 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Jack of HEARTS
        164 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Ten of DIAMONDS
        164 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Two of HEARTS
        164 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Nine of DIAMONDS
        166 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 4 cards to stack
        166 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        166 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Ten of CLUBS
        166 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays King of CLUBS
        166 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Three of CLUBS
        166 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Seven of CLUBS
        167 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 4 cards to stack
        167 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
        168 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Five of HEARTS
        168 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Two of CLUBS
        169 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 2 cards to stack
        176 [com.mark.war.War.main()] INFO com.mark.war.War - Game ranking {18=[#Player: 0, #CardsInHand: [], #CardsInStack: 18, StackCards Detail: [Five of CLUBS, Two of SPADES, Two of DIAMONDS, Nine of HEARTS, Four of HEARTS, Eight of CLUBS, Six of CLUBS, Eight of SPADES, Ace of HEARTS, Nine of CLUBS, Queen of CLUBS, Queen of DIAMONDS, Three of HEARTS, King of HEARTS, Ten of DIAMONDS, Two of HEARTS, Nine of DIAMONDS, Jack of HEARTS], #Player: 1, #CardsInHand: [], #CardsInStack: 18, StackCards Detail: [Queen of HEARTS, Jack of DIAMONDS, Six of HEARTS, Jack of CLUBS, Queen of SPADES, Four of CLUBS, Ace of SPADES, Seven of DIAMONDS, Ten of HEARTS, Seven of HEARTS, Three of DIAMONDS, Six of DIAMONDS, King of CLUBS, Three of CLUBS, Seven of CLUBS, Ten of CLUBS, Five of HEARTS, Two of CLUBS]], 12=[#Player: 2, #CardsInHand: [], #CardsInStack: 12, StackCards Detail: [Three of SPADES, King of SPADES, Eight of DIAMONDS, Seven of SPADES, Four of DIAMONDS, Six of SPADES, Ace of CLUBS, Five of SPADES, Nine of SPADES, Ten of SPADES, Ace of DIAMONDS, Five of DIAMONDS]], 4=[#Player: 3, #CardsInHand: [], #CardsInStack: 4, StackCards Detail: [Jack of SPADES, Eight of HEARTS, King of DIAMONDS, Four of SPADES]]}
        179 [com.mark.war.War.main()] INFO com.mark.war.War - *** Player 0 wins with the highest stack count of 18 ***
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time: 2.813 s
        [INFO] Finished at: 2015-09-26T12:03:13-07:00
        [INFO] Final Memory: 9M/159M
        [INFO] ------------------------------------------------------------------------
  