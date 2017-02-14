<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
        
            <head></head>
            <body>
                <xsl:apply-templates />
            </body>
        </html>
    </xsl:template>
    
	<xsl:template match="identities">
		<table>
			<thead>
				<tr>
					<th>Display Name</th>
					<th>Email</th>
					<th>Phone Number</th>
				</tr>
			</thead>
			<tbody>
				<xsl:apply-templates select="./*"/>
			</tbody>
		</table>
	</xsl:template>
	<xsl:template match="identity">
		<tr>
		  <xsl:apply-templates select="./*"/>
		</tr>
	</xsl:template>
    <xsl:template match="property">
        <td>
             <span>
                <xsl:value-of select="./text()" />
             </span>
        </td>

    </xsl:template>

</xsl:stylesheet>