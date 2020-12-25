FROM gitpod/workspace-full

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh \
             && sdk install java"

# Install custom tools, runtime, etc. using apt-get
# More information: https://www.gitpod.io/docs/config-docker/

RUN DEBIAN_FRONTEND=noninteractive && \
    sudo apt-get -q update && \
    sudo apt-get install -y bastet && \
    sudo rm -rf /var/lib/apt/lists/*
