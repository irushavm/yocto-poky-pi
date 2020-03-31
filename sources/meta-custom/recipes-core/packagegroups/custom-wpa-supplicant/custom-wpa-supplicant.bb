
SRC_URI = " \
    file://wpa_supplicant.conf \
"

do_install () {
    rm -f ${D}${etcdir}/wpa_supplicant.conf
	install -m 600 ${WORKDIR}/wpa_supplicant.conf ${D}${sysconfdir}/wpa_supplicant.conf
    echo "auto wlan0" >> ${D}${etcdir}/network/interfaces
}

CONFFILES_${PN} += "${sysconfdir}/wpa_supplicant.conf"