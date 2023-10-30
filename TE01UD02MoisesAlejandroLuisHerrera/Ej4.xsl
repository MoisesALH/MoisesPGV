<?xml version="1.0" encoding="UTF-8"?>
<!-- A) -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="xml" indent="yes" encoding="UTF-8"/>
  
  <xsl:template match="/">
    <xsl:apply-templates select="ies/ciclos/ciclo/nombre"/>
  </xsl:template>
  
  <xsl:template match="nombre">
    <xsl:value-of select="."/>
    <xsl:text>&#10;</xsl:text>
  </xsl:template>

</xsl:stylesheet>


<!-- B)
  <?xml version="1.0" encoding="UTF-8"?>
  <xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="xml" indent="yes" encoding="UTF-8"/>
    
    <xsl:template match="/">
      <html>
        <xsl:apply-templates select="ies/ciclos/ciclo/nombre"/>
      </html>
    </xsl:template>
    
    <xsl:template match="nombre">
      <p><xsl:value-of select="."/></p>
    </xsl:template>

  </xsl:stylesheet>

-->


<!-- C)
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="html" indent="yes" encoding="UTF-8"/>
  
  <xsl:template match="/">
    <html>
      <ul>
        <xsl:apply-templates select="ies/ciclos/ciclo/nombre"/>
      </ul>
    </html>
  </xsl:template>
  
  <xsl:template match="nombre">
    <li><xsl:value-of select="."/></li>
  </xsl:template>

</xsl:stylesheet>

-->

<!-- D)
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="html" indent="yes" encoding="UTF-8"/>
  
  <xsl:template match="/">
    <html>
      <table border="1">
        <xsl:apply-templates select="ies/ciclos/ciclo/nombre"/>
      </table>
    </html>
  </xsl:template>
  
  <xsl:template match="nombre">
    <tr>
      <td><xsl:value-of select="."/></td>
    </tr>
  </xsl:template>

</xsl:stylesheet>

-->
