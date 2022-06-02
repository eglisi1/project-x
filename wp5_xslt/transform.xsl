<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
      <head>
        <title>WP 5</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous" />
      </head>
      <body>
        <div class="container">
          <xsl:for-each select="dataset/performance">
            <div class="card border border-secondary mt-2">
              <div class="card-header">Performance</div>
              <div class="card-body">
                <h5 class="card-title">
                  <xsl:value-of select="performer" />
                </h5>
                <p class="card-text">
                  <xsl:value-of select="dtype" />
                </p>
              </div>
            </div>
          </xsl:for-each>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous">
        </script>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
