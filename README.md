## PARA CREAR UN NUEVO PROYECTO POR ARQUETIPOS EJECUTAR:
``` $ mvn clean test ```

```mvn archetype:generate -DarchetypeGroupId=io.lippia.archetypes -DarchetypeArtifactId=automationWebBasic -DarchetypeVersion=3.1.0.1 -DgroupId=[YOUR_GROUPID] -DartifactId=[YOUR_ARTIFACTID] -Dversion=[YOUR_VERSION]```

(Reemplazar corchetes por nuestros datos)

## EL PROYECTO YA INCLUYE EXTEND REPORT

## PARA AGREGAR PERFILES MAVEN Y DEBUGGEAR:

```clean -DforkCount=0 test```

#####To execute tests run:

``` $ mvn clean test ```
