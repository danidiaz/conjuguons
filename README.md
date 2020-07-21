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

    <article>
      <title>reramasser</title>
      <pageId>1602455</pageId>
      <meta/>
      <text>
        <etymology>
          <etym>
            <xml>de <i><innerLink ref="ramasser">ramasser</innerLink></i>, avec le préfixe <innerLink ref="re-">re-</innerLink>.</xml>
            <txt>de ramasser, avec le préfixe re-.</txt>
          </etym>
        </etymology>
        <pos type="verbe" lemma="1" locution="0">
          <pronunciations>
            <pron>ʁə.ʁa.ma.se</pron>
          </pronunciations>
          <paradigm>
            <inflection form="reramassas" gracePOS="Vmis2s-" prons="ʁə.ʁa.ma.sa"/>
            <inflection form="reramassâmes" gracePOS="Vmis1p-" prons="ʁə.ʁa.ma.sam"/>
            <inflection form="reramassassions" gracePOS="Vmsi1p-" prons="ʁə.ʁa.ma.sa.sjɔ̃"/>
            <inflection form="reramassât" gracePOS="Vmsi3s-" prons="ʁə.ʁa.ma.sa"/>
            <inflection form="reramasse" gracePOS="Vmsp1s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassiez" gracePOS="Vmii2p-" prons="ʁə.ʁa.ma.sje"/>
            <inflection form="reramassassiez" gracePOS="Vmsi2p-" prons="ʁə.ʁa.ma.sa.sje"/>
            <inflection form="reramasseras" gracePOS="Vmif2s-" prons="ʁə.ʁa.ma.sə.ʁa"/>
            <inflection form="reramassai" gracePOS="Vmis1s-" prons="ʁə.ʁa.ma.se"/>
            <inflection form="reramassasses" gracePOS="Vmsi2s-" prons="ʁə.ʁa.ma.sas"/>
            <inflection form="reramassent" gracePOS="Vmsp3p-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassiez" gracePOS="Vmsp2p-" prons="ʁə.ʁa.ma.sje"/>
            <inflection form="reramasserai" gracePOS="Vmif1s-" prons="ʁə.ʁa.ma.sə.ʁe"/>
            <inflection form="reramasserez" gracePOS="Vmif2p-" prons="ʁə.ʁa.ma.sə.ʁe"/>
            <inflection form="reramassassent" gracePOS="Vmsi3p-" prons="ʁə.ʁa.ma.sas"/>
            <inflection form="reramassâtes" gracePOS="Vmis2p-" prons="ʁə.ʁa.ma.sat"/>
            <inflection form="reramassions" gracePOS="Vmsp1p-" prons="ʁə.ʁa.ma.sjɔ̃"/>
            <inflection form="reramasse" gracePOS="Vmip3s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassée" gracePOS="Vmps-sf" prons=""/>
            <inflection form="reramasse" gracePOS="Vmsp3s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassais" gracePOS="Vmii2s-" prons="ʁə.ʁa.ma.sɛ"/>
            <inflection form="reramassaient" gracePOS="Vmii3p-" prons="ʁə.ʁa.ma.sɛ"/>
            <inflection form="reramassé" gracePOS="Vmps-sm" prons="ʁə.ʁa.ma.se"/>
            <inflection form="reramasseraient" gracePOS="Vmcp3p-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
            <inflection form="reramasse" gracePOS="Vmip1s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramasserions" gracePOS="Vmcp1p-" prons="ʁə.ʁa.ma.sə.ʁjɔ̃"/>
            <inflection form="reramassons" gracePOS="Vmip1p-" prons="ʁə.ʁa.ma.sɔ̃"/>
            <inflection form="reramasseront" gracePOS="Vmif3p-" prons="ʁə.ʁa.ma.sə.ʁɔ̃"/>
            <inflection form="reramassés" gracePOS="Vmps-pm" prons=""/>
            <inflection form="reramassez" gracePOS="Vmmp2p-" prons="ʁə.ʁa.ma.se"/>
            <inflection form="reramassez" gracePOS="Vmip2p-" prons="ʁə.ʁa.ma.se"/>
            <inflection form="reramassées" gracePOS="Vmps-pf" prons=""/>
            <inflection form="reramasses" gracePOS="Vmip2s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassions" gracePOS="Vmii1p-" prons="ʁə.ʁa.ma.sjɔ̃"/>
            <inflection form="reramassera" gracePOS="Vmif3s-" prons="ʁə.ʁa.ma.sə.ʁa"/>
            <inflection form="reramasserais" gracePOS="Vmcp1s-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
            <inflection form="reramasserait" gracePOS="Vmcp3s-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
            <inflection form="reramasses" gracePOS="Vmsp2s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassent" gracePOS="Vmip3p-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassant" gracePOS="Vmpp---" prons="ʁə.ʁa.ma.sã"/>
            <inflection form="reramassa" gracePOS="Vmis3s-" prons="ʁə.ʁa.ma.sa"/>
            <inflection form="reramassasse" gracePOS="Vmsi1s-" prons="ʁə.ʁa.ma.sas"/>
            <inflection form="reramassons" gracePOS="Vmmp1p-" prons="ʁə.ʁa.ma.sɔ̃"/>
            <inflection form="reramasser" gracePOS="Vmn----" prons="ʁə.ʁa.ma.se"/>
            <inflection form="reramassèrent" gracePOS="Vmis3p-" prons="ʁə.ʁa.ma.sɛʁ"/>
            <inflection form="reramasseriez" gracePOS="Vmcp2p-" prons="ʁə.ʁa.ma.sə.ʁje"/>
            <inflection form="reramassait" gracePOS="Vmii3s-" prons="ʁə.ʁa.ma.sɛ"/>
            <inflection form="reramassais" gracePOS="Vmii1s-" prons="ʁə.ʁa.ma.sɛ"/>
            <inflection form="reramasserons" gracePOS="Vmif1p-" prons="ʁə.ʁa.ma.sə.ʁɔ̃"/>
            <inflection form="reramasse" gracePOS="Vmmp2s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramasserais" gracePOS="Vmcp2s-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
          </paradigm>
          <definitions>
            <definition>
              <gloss>
                <xml><innerLink ref="ramasser">Ramasser</innerLink><innerLink ref="à nouveau">à nouveau</innerLink>.</xml>
                <txt>Ramasser à nouveau.</txt>
              </gloss>
              <example>
                <xml>
                  <i>Je finis de bouffer, et je reviens au boulot, <b>reramasser</b> des prunes.</i>
                </xml>
                <txt>Je finis de bouffer, et je reviens au boulot, reramasser des prunes.</txt>
              </example>
            </definition>
          </definitions>
        </pos>
      </text>
    </article>

Entry for a conjugated form:

    <article>
      <title>reramasserait</title>
      <pageId>1602958</pageId>
      <meta/>
      <text>
        <pos type="verbe" lemma="0" locution="0">
          <pronunciations>
            <pron>ʁə.ʁa.ma.sə.ʁɛ</pron>
          </pronunciations>
          <inflectionInfos>
            <inflectedForm gracePOS="Vmcp3s-" lemma="reramasser"/>
          </inflectionInfos>
          <definitions>
            <definition>
              <gloss>
                <xml><i>Troisième personne du singulier du conditionnel présent du verbe</i><innerLink ref="reramasser">reramasser</innerLink>.</xml>
                <txt>Troisième personne du singulier du conditionnel présent du verbe reramasser.</txt>
              </gloss>
            </definition>
          </definitions>
        </pos>
      </text>
    </article>

Entries for a two-form verb. Notice the multiple values for a "coordinate" in the paradigm tag:

    <article>
      <title>asseoir</title>
      <pageId>119764</pageId>
      <meta>
        <category>Rectifications orthographiques du français en 1990</category>
        <import>DAF8</import>
      </meta>
      <text>
        <pronunciations>
          <pron area="Canada">a.swɔːʁ</pron>
          <pron>a.swaʁ</pron>
          <pron area="France Paris">a.swaʁ</pron>
          <pron area="Canada">a.swɛːʁ</pron>
          <pron area="Canada">a.swɑːʁ</pron>
        </pronunciations>
        <etymology>
          <etym>
            <xml>du latin <foreignWord lang="la">assidere</foreignWord>.</xml>
            <txt>du latin assidere .</txt>
          </etym>
        </etymology>
        <pos type="verbe" lemma="1" locution="0">
          <pronunciations>
            <pron>a.swaʁ</pron>
          </pronunciations>
          <paradigm>
            <inflection form="asseyent" gracePOS="Vmsp3p-" prons="a.sɛj"/>
            <inflection form="assoient" gracePOS="Vmsp3p-" prons="a.swa"/>
            <inflection form="assieds" gracePOS="Vmip2s-" prons="a.sje"/>
            <inflection form="assois" gracePOS="Vmip2s-" prons="a.swa"/>
            <inflection form="assis" gracePOS="Vmps-sm" prons="a.si"/>
            <inflection form="assiérais" gracePOS="Vmcp1s-" prons="a.sje.ʁɛ"/>
            <inflection form="assoirais" gracePOS="Vmcp1s-" prons="a.swa.ʁɛ"/>
            <inflection form="assises" gracePOS="Vmps-pf" prons=""/>
            <inflection form="asseyaient" gracePOS="Vmii3p-" prons="a.sɛ.jɛ"/>
            <inflection form="assoyaient" gracePOS="Vmii3p-" prons="a.swa.jɛ"/>
            <inflection form="asseyiez" gracePOS="Vmsp2p-" prons="a.sɛj.je"/>
            <inflection form="assoyiez" gracePOS="Vmsp2p-" prons="a.swaj.je"/>
            <inflection form="assiéras" gracePOS="Vmif2s-" prons="a.sje.ʁa"/>
            <inflection form="assoiras" gracePOS="Vmif2s-" prons="a.swa.ʁa"/>
            <inflection form="asseoir" gracePOS="Vmn----" prons="a.swaʁ"/>
            <inflection form="asseyons" gracePOS="Vmip1p-" prons="a.sɛ.jɔ̃"/>
            <inflection form="assoyons" gracePOS="Vmip1p-" prons="a.swa.jɔ̃"/>
            <inflection form="assît" gracePOS="Vmsi3s-" prons="a.si"/>
            <inflection form="assîmes" gracePOS="Vmis1p-" prons="a.sim"/>
            <inflection form="assit" gracePOS="Vmis3s-" prons="a.si"/>
            <inflection form="assis" gracePOS="Vmis1s-" prons="a.si"/>
            <inflection form="assiérait" gracePOS="Vmcp3s-" prons="a.sje.ʁɛ"/>
            <inflection form="assoirait" gracePOS="Vmcp3s-" prons="a.swa.ʁɛ"/>
            <inflection form="assissions" gracePOS="Vmsi1p-" prons="a.si.sjɔ̃"/>
            <inflection form="asseyons" gracePOS="Vmmp1p-" prons="a.sɛ.jɔ̃"/>
            <inflection form="assoyons" gracePOS="Vmmp1p-" prons="a.swa.jɔ̃"/>
            <inflection form="asseyait" gracePOS="Vmii3s-" prons="a.sɛ.jɛ"/>
            <inflection form="assoyait" gracePOS="Vmii3s-" prons="a.swa.jɛ"/>
            <inflection form="assise" gracePOS="Vmps-sf" prons=""/>
            <inflection form="asseye" gracePOS="Vmsp1s-" prons="a.sɛj"/>
            <inflection form="assoie" gracePOS="Vmsp1s-" prons="a.swa"/>
            <inflection form="assieds" gracePOS="Vmip1s-" prons="a.sje"/>
            <inflection form="assois" gracePOS="Vmip1s-" prons="a.swa"/>
            <inflection form="asseyais" gracePOS="Vmii2s-" prons="a.sɛ.jɛ"/>
            <inflection form="assoyais" gracePOS="Vmii2s-" prons="a.swa.jɛ"/>
            <inflection form="assiérai" gracePOS="Vmif1s-" prons="a.sje.ʁe"/>
            <inflection form="assoirai" gracePOS="Vmif1s-" prons="a.swa.ʁe"/>
            <inflection form="assîtes" gracePOS="Vmis2p-" prons="a.sit"/>
            <inflection form="assis" gracePOS="Vmis2s-" prons="a.si"/>
            <inflection form="assiérais" gracePOS="Vmcp2s-" prons="a.sje.ʁɛ"/>
            <inflection form="assoirais" gracePOS="Vmcp2s-" prons="a.swa.ʁɛ"/>
            <inflection form="asseye" gracePOS="Vmsp3s-" prons="a.sɛj"/>
            <inflection form="assoie" gracePOS="Vmsp3s-" prons="a.swa"/>
            <inflection form="assiérions" gracePOS="Vmcp1p-" prons="a.sje.ʁjɔ̃"/>
            <inflection form="assoirions" gracePOS="Vmcp1p-" prons="a.swa.ʁjɔ̃"/>
            <inflection form="assied" gracePOS="Vmip3s-" prons="a.sje"/>
            <inflection form="assoit" gracePOS="Vmip3s-" prons="a.swa"/>
            <inflection form="assiéront" gracePOS="Vmif3p-" prons="a.sje.ʁɔ̃"/>
            <inflection form="assoiront" gracePOS="Vmif3p-" prons="a.swa.ʁɔ̃"/>
            <inflection form="asseyes" gracePOS="Vmsp2s-" prons="a.sɛj"/>
            <inflection form="assoies" gracePOS="Vmsp2s-" prons="a.swa"/>
            <inflection form="assis" gracePOS="Vmps-pm" prons=""/>
            <inflection form="asseyez" gracePOS="Vmmp2p-" prons="a.sɛ.je"/>
            <inflection form="assoyez" gracePOS="Vmmp2p-" prons="a.swa.je"/>
            <inflection form="asseyions" gracePOS="Vmsp1p-" prons="a.sɛj.jɔ̃"/>
            <inflection form="assoyions" gracePOS="Vmsp1p-" prons="a.swaj.jɔ̃"/>
            <inflection form="assirent" gracePOS="Vmis3p-" prons="a.siʁ"/>
            <inflection form="assisses" gracePOS="Vmsi2s-" prons="a.sis"/>
            <inflection form="asseyais" gracePOS="Vmii1s-" prons="a.sɛ.jɛ"/>
            <inflection form="assoyais" gracePOS="Vmii1s-" prons="a.swa.jɛ"/>
            <inflection form="asseyant" gracePOS="Vmpp---" prons="a.sɛ.jã"/>
            <inflection form="assoyant" gracePOS="Vmpp---" prons="a.swa.jã"/>
            <inflection form="assieds" gracePOS="Vmmp2s-" prons="a.sje"/>
            <inflection form="assois" gracePOS="Vmmp2s-" prons="a.swa"/>
            <inflection form="asseyez" gracePOS="Vmip2p-" prons="a.sɛ.je"/>
            <inflection form="assoyez" gracePOS="Vmip2p-" prons="a.swa.je"/>
            <inflection form="assiéraient" gracePOS="Vmcp3p-" prons="a.sje.ʁɛ"/>
            <inflection form="assoiraient" gracePOS="Vmcp3p-" prons="a.swa.ʁɛ"/>
            <inflection form="asseyions" gracePOS="Vmii1p-" prons="a.sɛj.jɔ̃"/>
            <inflection form="assoyions" gracePOS="Vmii1p-" prons="a.swaj.jɔ̃"/>
            <inflection form="assissent" gracePOS="Vmsi3p-" prons="a.sis"/>
            <inflection form="asseyent" gracePOS="Vmip3p-" prons="a.sɛj"/>
            <inflection form="assoient" gracePOS="Vmip3p-" prons="a.swa"/>
            <inflection form="assissiez" gracePOS="Vmsi2p-" prons="a.si.sje"/>
            <inflection form="assiérons" gracePOS="Vmif1p-" prons="a.sje.ʁɔ̃"/>
            <inflection form="assoirons" gracePOS="Vmif1p-" prons="a.swa.ʁɔ̃"/>
            <inflection form="assisse" gracePOS="Vmsi1s-" prons="a.sis"/>
            <inflection form="asseyiez" gracePOS="Vmii2p-" prons="a.sɛj.je"/>
            <inflection form="assoyiez" gracePOS="Vmii2p-" prons="a.swaj.je"/>
            <inflection form="assiériez" gracePOS="Vmcp2p-" prons="a.sje.ʁje"/>
            <inflection form="assoiriez" gracePOS="Vmcp2p-" prons="a.swa.ʁje"/>
            <inflection form="assiéra" gracePOS="Vmif3s-" prons="a.sje.ʁa"/>
            <inflection form="assoira" gracePOS="Vmif3s-" prons="a.swa.ʁa"/>
            <inflection form="assiérez" gracePOS="Vmif2p-" prons="a.sje.ʁe"/>
            <inflection form="assoirez" gracePOS="Vmif2p-" prons="a.swa.ʁe"/>
          </paradigm>
