# conjuguons
Conjuguons! \kɔ̃.jy.ɡɔ̃\

## resources

[GLAWI](https://twitter.com/DiazCarrete/status/1164939319049633792). [documentation en ligne](http://redac.univ-tlse2.fr/lexicons/glawi/doc/index.html)

> GLAWI est un dictionnaire électronique libre du français encodé au format XML. Il s'agit d'une version structurée et normalisée du Wiktionnaire

[G-PeTo](http://redac.univ-tlse2.fr/lexicons/glawi/tools/g-peto.html)

> G-PeTo (GLAWI Perl Tools) est un ensemble de programmes que nous diffusons pour permettre la manipulation de GLAWI, en particulier l'extraction de sous-lexiques et de contenus spécifiques. Les scripts peuvent être utilisés en l'état ou adaptés par vos soins à vos besoins particuliers.
 
> The first list of programs is made of quick-and-dirty scripts (quickly written, but also running faster than those using SAX/DOM parsing) that do not require any specific module installation and should run under any OS with Perl installed. They are also easy to modify if needed, with few programming skills.
> The programs perform a line-by-line reading of GLAWI and allow an extraction of one or several titles (headwords) or articles in XML format (intended e.g. to be transformed with an XSL sheet, manually browsed or further queried by any program).

> The programs using XML::DOM first work like SAX-parsers in order to build the textual content of a given article and then build a DOM document of the current article (discarding the DOM of the previous article). Once the DOM built, the search/extraction is performed.

[GLAWI pos](http://redac.univ-tlse2.fr/lexicons/glawi/doc/pos.html)

[GLAWI inflectionInfos](http://redac.univ-tlse2.fr/lexicons/glawi/doc/paradigmsAndInflections.html)

> when a POS section describes one or several inflected forms, the inflectionInfos element enumerates the morphosyntactic features of the forms and their lemmas.

> The gracePOS attribute given in inflectedForm and inflection follow the GRACE format (Rajman et al., 1997). It is used for nouns, verbs and adjectives as described below.

> Vmn----	Infinitive
> Vmpp---	Present participle
> Vm-ps-[sp][mf]	Past participle
> + number attribute [s/p]
> + gender attribute [m/f]
> Vm[ism][pifs][123][sp]-	Inflected verb form
> + mood (i: indicative, s: subjunctive, m: imperative)
> + tense (p: present, i: imperfect, f: future, s: past)
> + person ([123])
> + number (s: singular, p: plural)

Entry for an infinitive:

    22586619-  <article>
    22586620:    <title>reramasser</title>
    22586621-    <pageId>1602455</pageId>
    22586622-    <meta/>
    22586623-    <text>
    22586624-      <etymology>
    22586625-        <etym>
    22586626-          <xml>de <i><innerLink ref="ramasser">ramasser</innerLink></i>, avec le préfixe <innerLink ref="re-">re-</innerLink>.</xml>
    22586627-          <txt>de ramasser, avec le préfixe re-.</txt>
    22586628-        </etym>
    22586629-      </etymology>
    22586630-      <pos type="verbe" lemma="1" locution="0">
    22586631-        <pronunciations>
    22586632-          <pron>ʁə.ʁa.ma.se</pron>
    22586633-        </pronunciations>
    22586634-        <paradigm>
    22586635-          <inflection form="reramassas" gracePOS="Vmis2s-" prons="ʁə.ʁa.ma.sa"/>
    22586636-          <inflection form="reramassâmes" gracePOS="Vmis1p-" prons="ʁə.ʁa.ma.sam"/>
    22586637-          <inflection form="reramassassions" gracePOS="Vmsi1p-" prons="ʁə.ʁa.ma.sa.sjɔ̃"/>
    22586638-          <inflection form="reramassât" gracePOS="Vmsi3s-" prons="ʁə.ʁa.ma.sa"/>
    22586639-          <inflection form="reramasse" gracePOS="Vmsp1s-" prons="ʁə.ʁa.mas"/>
    22586640-          <inflection form="reramassiez" gracePOS="Vmii2p-" prons="ʁə.ʁa.ma.sje"/>
    22586641-          <inflection form="reramassassiez" gracePOS="Vmsi2p-" prons="ʁə.ʁa.ma.sa.sje"/>
    22586642:          <inflection form="reramasseras" gracePOS="Vmif2s-" prons="ʁə.ʁa.ma.sə.ʁa"/>
    22586643-          <inflection form="reramassai" gracePOS="Vmis1s-" prons="ʁə.ʁa.ma.se"/>
    22586644-          <inflection form="reramassasses" gracePOS="Vmsi2s-" prons="ʁə.ʁa.ma.sas"/>
    22586645-          <inflection form="reramassent" gracePOS="Vmsp3p-" prons="ʁə.ʁa.mas"/>
    22586646-          <inflection form="reramassiez" gracePOS="Vmsp2p-" prons="ʁə.ʁa.ma.sje"/>
    22586647:          <inflection form="reramasserai" gracePOS="Vmif1s-" prons="ʁə.ʁa.ma.sə.ʁe"/>
    22586648:          <inflection form="reramasserez" gracePOS="Vmif2p-" prons="ʁə.ʁa.ma.sə.ʁe"/>
    22586649-          <inflection form="reramassassent" gracePOS="Vmsi3p-" prons="ʁə.ʁa.ma.sas"/>
    22586650-          <inflection form="reramassâtes" gracePOS="Vmis2p-" prons="ʁə.ʁa.ma.sat"/>
    22586651-          <inflection form="reramassions" gracePOS="Vmsp1p-" prons="ʁə.ʁa.ma.sjɔ̃"/>
    22586652-          <inflection form="reramasse" gracePOS="Vmip3s-" prons="ʁə.ʁa.mas"/>
    22586653-          <inflection form="reramassée" gracePOS="Vmps-sf" prons=""/>
    22586654-          <inflection form="reramasse" gracePOS="Vmsp3s-" prons="ʁə.ʁa.mas"/>
    22586655-          <inflection form="reramassais" gracePOS="Vmii2s-" prons="ʁə.ʁa.ma.sɛ"/>
    22586656-          <inflection form="reramassaient" gracePOS="Vmii3p-" prons="ʁə.ʁa.ma.sɛ"/>
    22586657-          <inflection form="reramassé" gracePOS="Vmps-sm" prons="ʁə.ʁa.ma.se"/>
    22586658:          <inflection form="reramasseraient" gracePOS="Vmcp3p-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
    22586659-          <inflection form="reramasse" gracePOS="Vmip1s-" prons="ʁə.ʁa.mas"/>
    22586660:          <inflection form="reramasserions" gracePOS="Vmcp1p-" prons="ʁə.ʁa.ma.sə.ʁjɔ̃"/>
    22586661-          <inflection form="reramassons" gracePOS="Vmip1p-" prons="ʁə.ʁa.ma.sɔ̃"/>
    22586662:          <inflection form="reramasseront" gracePOS="Vmif3p-" prons="ʁə.ʁa.ma.sə.ʁɔ̃"/>
    22586663-          <inflection form="reramassés" gracePOS="Vmps-pm" prons=""/>
    22586664-          <inflection form="reramassez" gracePOS="Vmmp2p-" prons="ʁə.ʁa.ma.se"/>
    22586665-          <inflection form="reramassez" gracePOS="Vmip2p-" prons="ʁə.ʁa.ma.se"/>
    22586666-          <inflection form="reramassées" gracePOS="Vmps-pf" prons=""/>
    22586667-          <inflection form="reramasses" gracePOS="Vmip2s-" prons="ʁə.ʁa.mas"/>
    22586668-          <inflection form="reramassions" gracePOS="Vmii1p-" prons="ʁə.ʁa.ma.sjɔ̃"/>
    22586669:          <inflection form="reramassera" gracePOS="Vmif3s-" prons="ʁə.ʁa.ma.sə.ʁa"/>
    22586670:          <inflection form="reramasserais" gracePOS="Vmcp1s-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
    22586671:          <inflection form="reramasserait" gracePOS="Vmcp3s-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
    22586672-          <inflection form="reramasses" gracePOS="Vmsp2s-" prons="ʁə.ʁa.mas"/>
    22586673-          <inflection form="reramassent" gracePOS="Vmip3p-" prons="ʁə.ʁa.mas"/>
    22586674-          <inflection form="reramassant" gracePOS="Vmpp---" prons="ʁə.ʁa.ma.sã"/>
    22586675-          <inflection form="reramassa" gracePOS="Vmis3s-" prons="ʁə.ʁa.ma.sa"/>
    22586676-          <inflection form="reramassasse" gracePOS="Vmsi1s-" prons="ʁə.ʁa.ma.sas"/>
    22586677-          <inflection form="reramassons" gracePOS="Vmmp1p-" prons="ʁə.ʁa.ma.sɔ̃"/>
    22586678:          <inflection form="reramasser" gracePOS="Vmn----" prons="ʁə.ʁa.ma.se"/>
    22586679-          <inflection form="reramassèrent" gracePOS="Vmis3p-" prons="ʁə.ʁa.ma.sɛʁ"/>
    22586680:          <inflection form="reramasseriez" gracePOS="Vmcp2p-" prons="ʁə.ʁa.ma.sə.ʁje"/>
    22586681-          <inflection form="reramassait" gracePOS="Vmii3s-" prons="ʁə.ʁa.ma.sɛ"/>
    22586682-          <inflection form="reramassais" gracePOS="Vmii1s-" prons="ʁə.ʁa.ma.sɛ"/>
    22586683:          <inflection form="reramasserons" gracePOS="Vmif1p-" prons="ʁə.ʁa.ma.sə.ʁɔ̃"/>
    22586684-          <inflection form="reramasse" gracePOS="Vmmp2s-" prons="ʁə.ʁa.mas"/>
    22586685:          <inflection form="reramasserais" gracePOS="Vmcp2s-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
    22586686-        </paradigm>
    22586687-        <definitions>
    22586688-          <definition>
    22586689-            <gloss>
    22586690-              <xml><innerLink ref="ramasser">Ramasser</innerLink><innerLink ref="à nouveau">à nouveau</innerLink>.</xml>
    22586691-              <txt>Ramasser à nouveau.</txt>
    22586692-            </gloss>
    22586693-            <example>
    22586694-              <xml>
    22586695:                <i>Je finis de bouffer, et je reviens au boulot, <b>reramasser</b> des prunes.</i>
    22586696-              </xml>
    22586697:              <txt>Je finis de bouffer, et je reviens au boulot, reramasser des prunes.</txt>
    22586698-            </example>
    22586699-          </definition>
    22586700-        </definitions>
    22586701-      </pos>
    22586702-    </text>
    22586703-  </article>

Entry for a conjugated form:

    22599322-  <article>
    22599323:    <title>reramasserait</title>
    22599324-    <pageId>1602958</pageId>
    22599325-    <meta/>
    22599326-    <text>
    22599327-      <pos type="verbe" lemma="0" locution="0">
    22599328-        <pronunciations>
    22599329-          <pron>ʁə.ʁa.ma.sə.ʁɛ</pron>
    22599330-        </pronunciations>
    22599331-        <inflectionInfos>
    22599332-          <inflectedForm gracePOS="Vmcp3s-" lemma="reramasser"/>
    22599333-        </inflectionInfos>
    22599334-        <definitions>
    22599335-          <definition>
    22599336-            <gloss>
    22599337-              <xml><i>Troisième personne du singulier du conditionnel présent du verbe</i><innerLink ref="reramasser">reramasser</innerLink>.</xml>
    22599338-              <txt>Troisième personne du singulier du conditionnel présent du verbe reramasser.</txt>
    22599339-            </gloss>
    22599340-          </definition>
    22599341-        </definitions>
    22599342-      </pos>
    22599343-    </text>
    22599344-  </article>

