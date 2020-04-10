SUMMARY = "Custom development image"

require custom-image-prod.bb

IMAGE_FEATURES += "ssh-server-dropbear tools-debug debug-tweaks"

CORE_IMAGE_EXTRA_INSTALL += "custom-packagegroup-testapps"
